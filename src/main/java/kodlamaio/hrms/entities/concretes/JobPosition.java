package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(name="id")
	    private int id;

	    @Column(name="position")
	    private String position;

		public JobPosition(int id, String position) {
			super();
			this.id = id;
			this.position = position;
		}
	
		public JobPosition() {
			
		}


}
