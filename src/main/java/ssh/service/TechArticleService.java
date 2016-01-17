package ssh.service;

import ssh.hibernate.pojo.Technology;

import java.util.List;

public interface TechArticleService {
    public boolean addArticle(Technology article);

    public boolean updateArticle(Technology article);

    public List<Technology> findArticleByProperty(String prop, Object value);

    public List<Technology> findArtcleByProperties(String hql, Object[] values);
}
