package dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        dict.add("Turtle, eastern box", "Terrapene carolina", "donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id\n");
        dict.add("Peccary, collared", "Tayassu tajacu", "justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis\n");
        dict.add("Mule deer", "Odocoileus hemionus", "pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis\n");
        dict.add("Stork, openbill", "Anastomus oscitans", "aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero\n");
        dict.add("Masked booby", "Sula dactylatra", "a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet\n");
        dict.add("Dove, laughing", "Streptopelia senegalensis", "id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque\n");
        dict.add("Cheetah", "Acinynox jubatus", "lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue\n");
        dict.add("Northern phalarope", "Phalaropus lobatus", "erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris\n");
        dict.add("Red-billed hornbill", "Tockus erythrorhyncus", "sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus\n");
        dict.search("ed");
        dict.delete("Turtle, eastern box");
        dict.delete("mule");
        dict.showAll();
    }
}
