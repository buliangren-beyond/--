package 七大规则;
//迪米特法则
public class Dimite {
    private Control control;
	public void visit(Control control) {
		control.visit();
	}
	public Control getControl() {
    	return control;
    }
	public void setControl(Control control) {
		this.control = control;
	}
}
class Control{
	public void visit() {
		System.out.println("对Control访问");
	}
	public void visitDAO() {
		DAO dao = new DAO();
		dao.visit();
	}
}
class DAO{
	public void visit() {
		System.out.println("对DAO访问");
	}
}