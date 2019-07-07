package dao;

import java.util.List;

import model.PersonalId;

public interface PersonalIdDao {

	List<PersonalId> getallInfos();

	void savePersonalId(PersonalId personalId);

	void deletePersonalId(PersonalId personalId);

	void updatePersonalId(PersonalId personalId);

	void addPersonalId(PersonalId personalId);

}
