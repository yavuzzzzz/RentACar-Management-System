package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "brands")
@Data // tüm getter setter ları çağırır
@AllArgsConstructor // parametreli constructor ı olusturur.
@Entity
public class Brand {

	@Id // primary key olduğunu gösterir
	@GeneratedValue(strategy = GenerationType.IDENTITY)// id yi otomatik artırmaya yarar.
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public Brand() {
		super();
	}

}
