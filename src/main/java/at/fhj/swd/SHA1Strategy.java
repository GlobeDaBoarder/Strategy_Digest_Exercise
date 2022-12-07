package at.fhj.swd;

import at.fhj.swd.utils.HashUtils;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class SHA1Strategy implements HashStrategy{
    @Override
    public String toHashString(String message){
        try {
            return Hex.encodeHexString(HashUtils.toSHA1(message));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
