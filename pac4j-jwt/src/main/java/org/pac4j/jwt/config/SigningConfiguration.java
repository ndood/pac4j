package org.pac4j.jwt.config;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

/**
 * Signing configuration.
 *
 * @author Jerome Leleu
 * @since 1.9.2
 */
public interface SigningConfiguration {

    /**
     * Whether this signing configuration supports this algorithm.
     *
     * @param algorithm the signing algorithm
     * @return whether this signing configuration supports this algorithm
     */
    boolean supports(JWSAlgorithm algorithm);

    /**
     * Generate a signed JWT based on claims.
     *
     * @param claims the provided claims
     * @return the signed JWT
     */
    SignedJWT sign(JWTClaimsSet claims);

    /**
     * Verify a signed JWT.
     *
     * @param jwt the signed JWT
     * @return whether the signed JWT is verified
     */
    //boolean verify(SignedJWT jwt);
}
