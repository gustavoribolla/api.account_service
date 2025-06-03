package store.account;

import java.util.Date;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Builder
@Data @Accessors(fluent = true)
public class Account implements Serializable {
    private String id;
    private String name;
    private String email;
    private String password;
    private String sha256;
    private Date birthdate;
    private Date creation;
}
