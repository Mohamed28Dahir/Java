package com.SMS.Staff.management.system;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StaffService {
    private final Map<Long, StaffModel> staffMap = new HashMap<>();
    private long idCounter = 1;

    public StaffModel createStaff(StaffModel staff) {
        staff.setId(idCounter++);
        staffMap.put(staff.getId(), staff);
        return staff;
    }

    public List<StaffModel> getAllStaffs() {
        return new ArrayList<>(staffMap.values());
    }

    public Optional<StaffModel> getStaffById(Long id) {
        return Optional.ofNullable(staffMap.get(id));
    }

    public Optional<StaffModel> updateStaff(Long id, StaffModel updatedStaff) {
        if (staffMap.containsKey(id)) {
            updatedStaff.setId(id);
            staffMap.put(id, updatedStaff);
            return Optional.of(updatedStaff);
        }
        return Optional.empty();
    }

    public boolean deleteStaff(Long id) {
        return staffMap.remove(id) != null;
    }
}
