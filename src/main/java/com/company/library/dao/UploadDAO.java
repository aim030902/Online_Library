package com.company.library.dao;

import com.company.library.domains.Uploads;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.util.Optional;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UploadDAO extends GenericDAO<Uploads, Long> {
    private static UploadDAO instance;

    public static UploadDAO getInstance() {
        if (instance == null) {
            instance = new UploadDAO();
        }
        return instance;
    }

    public Optional<Uploads> getByPath(String path) {
        Session session = getSession();
        session.beginTransaction();

        Uploads result = session.createQuery("select t from Uploads t where t.path=:path", Uploads.class)
                .setParameter("path", path)
                .getSingleResultOrNull();

        session.getTransaction().commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
