package mathias.vanhack.skip.authmodule.service;

import mathias.vanhack.skip.authmodule.model.AuthUser;
import mathias.vanhack.skip.authmodule.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private AuthUserRepository authUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if (username == null) {
            throw new IllegalArgumentException("Username can not be null.");
        }

        final Optional<AuthUser> user = authUserRepository.findByUsername(username);

        final AuthUser authUser = user.orElseThrow(() -> new UsernameNotFoundException("Bad credentials."));

        return org.springframework.security.core.userdetails.User.withUsername(authUser.getUsername())
                .password(authUser.getPassword())
                .roles("USER")
                .build();
    }

}
