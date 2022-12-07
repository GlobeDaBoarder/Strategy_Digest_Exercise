package at.fhj.swd;

import at.fhj.swd.utils.HashUtils;
import org.apache.commons.codec.binary.Hex;

import java.security.NoSuchAlgorithmException;

class SHA256Strategy implements HashStrategy{
    @Override
    public String toHashString(String message){
        try {
            return Hex.encodeHexString(HashUtils.toSHA256(message.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
