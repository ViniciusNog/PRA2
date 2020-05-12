import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
@Entity(tableName = "parks")//criação da entidade

public class Parks{

	@PrimaryKey(autoGenerate = true)
  
	@NonNull
  
	@ColumnInfo(name = "parksId")
  
	private int mId; //identificador único

	@Nullable

	@ColumnInfo(name = "parkstCreationDate")

	private String mCreationDate;//data de controle para o BD

	@Nullable

	@ColumnInfo(name = "parksName")

	private String mName; //nome do parque

	@Nullable

	@ColumnInfo(name = "parksLocation")

	private String mLocation; //nome do lugar onde está o parque

	@Nullable

	@ColumnInfo(name = "parksScore")

	private int mScore; //nota do parque de 0 à 10

	public Parks(@Nullable String creationdate, String name, int score, String location) {

    mCreationDate = creationdate;

    mName = name;

    mLocation = location;

    mScore = score;
	}
  
	//Gerando getters and setters

	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		mId = Id;
	}

	public String getCreationDate() {
		return mCreationDate;
	}

	public void setmCreationDate(String CreationDate) {
		mCreationDate = CreationDate;
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		mName = Name;
	}

	public String getLocation() {
		return mLocation;
	}

	public void setLocation(String mLocation) {
		mLocation = Location;
	}

	public int getScore() {
		return mScore;
	}

	public void setScore(int mScore) {
		mScore = Score;
	}
  
  //private int mScore
  //private int mCreationDate
}
