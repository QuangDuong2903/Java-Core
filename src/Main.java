import java.math.BigDecimal;
import java.util.List;

abstract class Staff {
    protected String id;
    protected String name;
    protected String role;
    protected float salaryCoefficient;

    public BigDecimal getSalary() {
        return BigDecimal.valueOf(salaryCoefficient * 1000000);
    }

    abstract Staff getStaffById(String id);

    public Staff(String id, String name, String role, float salaryCoefficient) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salaryCoefficient = salaryCoefficient;
    }
}

class LowLevelStaff extends Staff {

    @Override
    public Staff getStaffById(String id) {
        return this.id.equals(id) ? this : null;
    }

    public LowLevelStaff(String id, String name, String role, float salaryCoefficient) {
        super(id, name, role, salaryCoefficient);
    }
}

class HighLevelStaff extends Staff {

    private List<Staff> staffs;

    @Override
    public Staff getStaffById(String id) {
        if (this.id.equals(id))
            return this;
        for (Staff staff : staffs) {
            if (staff.getStaffById(id) != null)
                return staff.getStaffById(id);
        }
        return null;
    }

    public void add(Staff staff) {
        staffs.add(staff);
    }

    public void remove(String id) {
        staffs.removeIf(staff -> staff.id.equals(id));
    }

    public HighLevelStaff(String id, String name, String role, float salaryCoefficient, List<Staff> staffs) {
        super(id, name, role, salaryCoefficient);
        this.staffs = staffs;
    }
}

public class Main {

    public static void main(String[] args) {
        HighLevelStaff ceo = new HighLevelStaff(
                "NV01", "CEO", "CEO", 10,
                List.of(
                        new HighLevelStaff(
                                "NV02", "VDr Marketing", "VDr Marketing", 9,
                                List.of(
                                        new LowLevelStaff("NV03", "Tro ly", "Tro ly", 8),
                                        new LowLevelStaff("NV04", "Tro ly", "Tro ly", 8)
                                )
                        ),
                        new HighLevelStaff(
                                "NV05", "VDr SanXuat", "VDr SanXuat", 9,
                                List.of(
                                        new LowLevelStaff("NV06", "NV QuangCao", "NV QuangCao", 8),
                                        new LowLevelStaff("NV07", "NV KeToan", "NV KeToan", 8),
                                        new LowLevelStaff("NV08", "NV VanChuyen", "NV VanChuyen", 8)
                                )
                        )
                )
        );

        System.out.println(ceo.getSalary().intValueExact());
        System.out.println(ceo.getStaffById("NV07").getSalary().intValueExact());
    }

}
