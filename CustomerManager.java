
public class CustomerManager {
	IDal _dal;
	
	
	public CustomerManager(IDal DAL) {
		this._dal = DAL;
	
	}
	
	public void add() {
		this._dal.add();
	}

}
