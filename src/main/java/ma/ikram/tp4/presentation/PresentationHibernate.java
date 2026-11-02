package ma.ikram.tp4.presentation;

import ma.ikram.tp4.dao.ArticleDaoImpl;
import ma.ikram.tp4.dao.IArticleDao;
import ma.ikram.tp4.entities.Article;

public class PresentationHibernate {
    public static void main(String[] args) {
        System.out.println("========== TEST PERSISTANCE HIBERNATE 6 (Ikram) ==========");
        IArticleDao dao = new ArticleDaoImpl();

        Article a1 = new Article("ART-001", "Micro-contrôleur ESP32", 85.5, 50);
        Article a2 = new Article("ART-002", "Capteur Température DHT22", 45.0, 100);

        dao.save(a1);
        dao.save(a2);

        System.out.println(">>> Nombre d'articles persistés: " + dao.findAll().size());
        dao.findAll().forEach(a -> System.out.println(" - " + a.getReference() + " : " + a.getDesignation() + " (" + a.getPrixUnitaire() + " DH)"));
    }
}
