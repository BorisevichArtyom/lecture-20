package by.itacademy.javaenterprise.borisevich.entity;

public enum RoleType {

    ADMIN(0), ATHLETE(1), COACH(2);

    private final int id;

    RoleType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static RoleType getRoleByid(int id) {
        for (RoleType roleType : RoleType.values()) {
            if (roleType.id == id) {
                return roleType;
            }
        }
        throw new IllegalArgumentException("No Role found by this id:" + id);
    }
}