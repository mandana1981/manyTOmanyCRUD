package ca.sematec.mtm.controller;

import ca.sematec.mtm.model.Permission;
import ca.sematec.mtm.model.User;
import ca.sematec.mtm.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionController {
    @Autowired
    PermissionService permissionService;

    @GetMapping()
    public ResponseEntity<List<Permission>> getAllPermissions() {
        List<Permission> permissionss = permissionService.getAllPermissions();
        return ResponseEntity.ok(permissionss);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Permission> getPermissionById(@PathVariable int id) {
        Permission permission = permissionService.getByIdPermission(id);
        return ResponseEntity.ok(permission);
    }

    @PostMapping()
    public ResponseEntity<Permission> addPermission(@RequestBody Permission permission) {
        permissionService.savePermission(permission);
        return ResponseEntity.ok(permission);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Permission> updatePermission(@PathVariable int id,@RequestBody Permission permission) {
        permissionService.updatePermission(permission);
        return ResponseEntity.ok(permission);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Permission> deletePermission(@PathVariable int id) {
        permissionService.deletePermission(id);
        return ResponseEntity.ok(permissionService.getByIdPermission(id));
    }
}
