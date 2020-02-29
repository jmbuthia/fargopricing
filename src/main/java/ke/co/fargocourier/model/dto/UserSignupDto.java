package ke.co.fargocourier.model.dto;

import java.io.Serializable;
import java.util.Date;


import ke.co.fargocourier.model.Branch;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@NoArgsConstructor
public class UserSignupDto implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String username;
    
    private String password;
    
   
    private String firstname;
    
  
    private String lastname;
    
    private String profile;
    
     
    private Date dateOfBirth;
    
    private String phone;
    
    private boolean isPhoneVerified;
    
    private boolean isAccountNonExpired;

    
    private boolean isAccountNonLocked;
    
    
    private boolean isCredentialsNonExpired;
   
    private boolean isEnabled;
    private Branch branch;
           
}
