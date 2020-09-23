package string;

public class IPAddressDefanger {
    public String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        String defangedIpAddress = split[0];
        for (int i = 1; i < split.length; i++) {
            defangedIpAddress+="[.]"+split[i];
        }
        return defangedIpAddress;
    }
}
