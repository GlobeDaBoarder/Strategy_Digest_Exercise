package at.fhj.swd;

public class FactoryImpl implements Factory{
    @Override
    public HashStrategy createHashAlgorithm(DigestType type) {
        if (type == null)
            throw new IllegalArgumentException();

        return switch (type) {
            case SHA_1 -> new SHA1Strategy();
            case SHA_256 -> new SHA256Strategy();
            case SHA_512 -> new SHA512Strategy();
        };
    }
}
