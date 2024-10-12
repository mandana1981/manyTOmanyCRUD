package ca.sematec.mtm.service;

import ca.sematec.mtm.model.Permission;
import ca.sematec.mtm.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    PermissionRepository permissionRepository;

    public Permission getByIdPermission(int id) {
        return permissionRepository.findById(id).get();
    }
    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public Permission savePermission(Permission permission) {
        return   permissionRepository.save(permission);
    }

    public Permission deletePermission(int id) {

        return permissionRepository.findById(id).get();

    }
    public Permission updatePermission(Permission permission) {
        return permissionRepository.save(permission);
    }
}
