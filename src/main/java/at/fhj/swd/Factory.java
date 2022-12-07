package at.fhj.swd;

public interface Factory {
    Factory INSTANCE = new FactoryImpl();
    
    HashStrategy createHashAlgorithm(DigestType type);
}
