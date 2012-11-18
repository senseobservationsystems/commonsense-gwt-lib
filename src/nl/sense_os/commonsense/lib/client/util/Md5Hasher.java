package nl.sense_os.commonsense.lib.client.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Hasher {

    /**
     * Creates an MD5 hash of a String, for hashing the password before sending it.
     * 
     * @param s
     *            String to hash
     * @return the hashed String, zero-padded to make it always 32 characters long
     */
    public static String hash(String s) {
        String hashed = null;
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(s.getBytes("UTF-8"));
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            hashed = bigInt.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashed.length() < 32) {
                hashed = "0" + hashed;
            }
        } catch (UnsupportedEncodingException e) {
            hashed = null;
        } catch (NoSuchAlgorithmException e) {
            hashed = null;
        }
        return hashed;
    }

    private Md5Hasher() {
        // Private constructor to make sure this class is not instantiated.
    }
}
