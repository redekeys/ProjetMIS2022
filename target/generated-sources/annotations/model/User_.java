package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-29T13:02:22")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> lastLogin;
    public static volatile SingularAttribute<User, Integer> iduser;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> username;

}