package at.fhj.swd;

import at.fhj.swd.utils.HashUtils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

class SHA512Strategy implements HashStrategy{
    @Override
    public String toHashString(String message){
        try {
            return HashUtils.toSHA512(message);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
