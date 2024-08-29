package ca.sematec.mtm.service;

import ca.sematec.mtm.model.Role;
import ca.sematec.mtm.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
     RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(int id) {
        return roleRepository.findById(id).get();
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public Role deleteRole(int id) {
      return   roleRepository.findById(id).get();
    }

    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }
}
