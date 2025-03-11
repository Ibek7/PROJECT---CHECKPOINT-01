public class Item {
    private String name;
    private String type;
    private String description;

    public Item(String pName, String pType, String pDescription) {
        this.name = pName;
        this.type = pType;
        this.description = pDescription;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Item[name=" + name + ", type=" + type + ", description=" + description + "]";
    }
}
