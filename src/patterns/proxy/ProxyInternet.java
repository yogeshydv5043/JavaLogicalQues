package patterns.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    private final RealInternet realInternet = new RealInternet();
    List<String> bannedSites = Arrays.asList("youtube.com", "instagram.com", "facebook.com", "x.com", "snapchat.com");

    @Override
    public void connect(String site) throws Exception {
        if (bannedSites.contains(site.toLowerCase())) {
            throw new Exception("Access Denied to " + site);
        }
        realInternet.connect(site);
    }
}
