package uvsq.fr.pglp_5_1;

public class DAOFactory {
	public static DAO<Annuaire> getAnnuaireDAO(){

        return new AnnuaireDAO();
    }


}
