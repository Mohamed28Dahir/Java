package com.SMS.Staff.management.system;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffModel> getAllStaffs() {
        return staffService.getAllStaffs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffModel> getStaff(@PathVariable Long id) {
        return staffService.getStaffById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<StaffModel> createStaff(@RequestBody StaffModel staff) {
        StaffModel created = staffService.createStaff(staff);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StaffModel> updateStaff(@PathVariable Long id, @RequestBody StaffModel staff) {
        return staffService.updateStaff(id, staff)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable Long id) {
        if (staffService.deleteStaff(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
