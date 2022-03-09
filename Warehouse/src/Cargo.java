public class Cargo {
    /**
     габариты;
     масса;
     адрес доставки;
     свойство — можно ли переворачивать;
     регистрационный номер (может содержать буквы);
     является ли груз хрупким.
     */
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean abilityToFlip;
    private final String registrationNumber;
    private final boolean possiblyFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress,
                 boolean abilityToFlip, String registrationNumber, boolean possiblyFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.abilityToFlip = abilityToFlip;
        this.registrationNumber = registrationNumber;
        this.possiblyFragile = possiblyFragile;
    }

    //-------------------------GET--------------------------------------------------------------//

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isAbilityToFlip() {
        return abilityToFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isPossiblyFragile() {
        return possiblyFragile;
    }

    //-------------------------SET--------------------------------------------------------------//

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress,
                abilityToFlip, registrationNumber, possiblyFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress,
                abilityToFlip, registrationNumber, possiblyFragile);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress,
                abilityToFlip, registrationNumber, possiblyFragile);
    }

    public Cargo setAbilityToFlip(boolean abilityToFlip) {
        return new Cargo(dimensions, weight, deliveryAddress,
                abilityToFlip, registrationNumber, possiblyFragile);
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, deliveryAddress,
                abilityToFlip, registrationNumber, possiblyFragile);
    }

    public Cargo setPossiblyFragile(boolean possiblyFragile) {
        return new Cargo(dimensions, weight, deliveryAddress,
                abilityToFlip, registrationNumber, possiblyFragile);
    }

    private String messageAbilityToFlip(boolean abilityToFlip){
        if(!abilityToFlip){
            return "\nНельзя переворачивать";
        }
        return "\nМожно переворачивать";
    }
    private String messagePossiblyFragile(boolean possiblyFragile){
        if(!possiblyFragile){
            return "\nТовар очень хрупкий";
        }
        return "\nТовар не хрупкий";
    }


    @Override
    public String toString() {
        return  dimensions +
                "\nмасса = " + weight + " кг." +
                "\nАдрес доставки: '" + deliveryAddress + messageAbilityToFlip(abilityToFlip) +
                "\nРегистрационный номер: '" + registrationNumber +
                messagePossiblyFragile(possiblyFragile);
    }

}
