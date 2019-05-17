package com.cotecoeur.user.service;


import com.cotecoeur.user.model.User;
import com.cotecoeur.user.model.UserDTO;
import com.cotecoeur.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;
    
    @Autowired
	private MapperUserService mus;


    public User findByEmail(String email) {
        return ur.findByEmail(email);
    }
        /*
    public UserDTO save(UserDTO userDTO) throws ControllerUserException {
		try {
			return mpu.toDTO(ur.save(mpu.toEntity(userDTO)));

		} catch (Exception e) {
			throw new ControllerUserException("L'email " + userDTO.getEmail() + " existe déjà.");

		}
	}
    
    public List<UserDTO> findByLastName(String lastName) throws ControllerUserException {
		try {
			return mpu.toDTOs(ur.findByLastName(lastName));

		} catch (Exception e) {
			throw new ControllerUserException("Aucun utilisateur avec le nom : " + lastName + "n'a été trouvé.");

		}
	}

	public List<UserDTO> findByFirstName(String firstName) throws ControllerUserException {
		try {
			return mpu.toDTOs(ur.findByFirstName(firstName));
		} catch (Exception e) {
			throw new ControllerUserException("Aucun utilisateur avec le prénom : " + firstName + "n'a été trouvé.");

		}
	}

	public UserDTO findByEmail(String email) throws ControllerUserException {
		try {
			return mpu.toDTO(ur.findByEmail(email));
		} catch (Exception e) {
			throw new ControllerUserException("L'utilisateurs avec le mail : " + email + "n'a pas été trouvé.");

		}
	}
    
    public List<UserDTO> findByRole(RoleEnum role) throws ControllerUserException {
		try {
			return mpu.toDTOs(ur.findByRole(role));
		} catch (Exception e) {
			throw new ControllerUserException("Aucun utilisateur avec le role : " + role + '.');

		}
	}

	public UserDTO findById(Long id) throws ControllerUserException {
		Optional<User> userOptional = ur.findById(id);
		if (userOptional.isPresent()) {
			return mpu.toDTO(userOptional.get());
		} else {
			throw new ControllerUserException("L'id correpond à aucun user");
		}
	}

	public List<UserDTO> findAllById(List<Long> ids) {
		return mpu.toDTOs(ur.findAllById(ids));
	}
    
    public UserDTO findByPwdAndEmail(String password, String email) {
		Optional<User> userOptional = ur.findByPasswordAndEmail(password, email);
		if (userOptional.isPresent()) {
			return mpu.toDTO(userOptional.get());
		} else {
			throw new ControllerUserException("Le user n'existe pas");
		}
	}

	public boolean existsById(Long id) {
		return ur.existsById(id);
	}

	public List<UserDTO> findAll() {
		return mpu.toDTOs(ur.findAll());
	}
	
    
    public void deleteById(Long id) {
		User u = ur.findById(id).orElseThrow(() ->  new ControllerUserException("Le user n'existe pas"));
		if(or.findByUser(u).size()>0) {
			throw new ControllerUserException("Cet utilisateur ne peut pas etre supprimé car il a déjà affecté à une mission");
		}else {
			ur.deleteById(id);
		}
		
	}
    */

	public void delete(UserDTO userDTO) {
		ur.delete(mus.toEntity(userDTO));
	}
}
