public class Restaurant {
    private int id;
    private int menuId;
    private String name;
    private long waitTime; // update DCD
    private String desc; // update DCD

    public Restaurant(int id, int menuId, String name, long waitTime, String desc) {
        this.id = id;
        this.menuId = menuId;
        this.name = name;
        this.waitTime = waitTime;
        this.desc = desc;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMenuId() {
        return this.menuId;
    }

    public void setMenuID(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWaitTime() {
        return this.waitTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public void displayWaitTime() {
        switch(this.id) {
            case 1:
                System.out.println(this.waitTime = 11L);
                break;
            case 2:
                System.out.println(this.waitTime = 12L);
                break;
            case 3:
                System.out.println(this.waitTime = 13L);
        }
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }
}
