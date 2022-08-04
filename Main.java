
public class Main {

	public static void main(String[] args) {
	CustomerManager _manager = new CustomerManager(new MySqlDal());
	_manager.add();


	}
	//Ioc bilgisayar programının özel olarak yazılan bölümleri, genel bir çerçeveden denetim akışını alır.
	//Dependency injection kaba tabir ile bir sınıfın/nesnenin bağımlılıklardan kurtulmasını amaçlayan ve o nesneyi olabildiğince bağımsızlaştıran bir programlama tekniği/prensibidir.

}
