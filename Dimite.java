package �ߴ����;
//�����ط���
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
		System.out.println("��Control����");
	}
	public void visitDAO() {
		DAO dao = new DAO();
		dao.visit();
	}
}
class DAO{
	public void visit() {
		System.out.println("��DAO����");
	}
}