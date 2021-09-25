package LoginUtenteRESTPostgres.AccessManager;

import lombok.Data;

@Data
public class LoginDTO {
    String email;
    String password;
}
