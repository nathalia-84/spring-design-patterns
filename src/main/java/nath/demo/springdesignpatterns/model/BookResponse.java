package nath.demo.springdesignpatterns.model;

import java.util.List;

public class BookResponse {
    private String key;
    private String name;
    private String subjectType;
    private Integer workCount;
    private List<Work> works;

    // Getters e Setters


    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public Integer getWorkCount() {
        return workCount;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public void setWorkCount(Integer workCount) {
        this.workCount = workCount;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public static class Work {
        private String key;
        private String title;
        private Integer editionCount;
        private List<Author> authors;
        private Boolean hasFulltext;
        private String ia;

        // Getters e Setters

        public String getKey() {
            return key;
        }

        public String getTitle() {
            return title;
        }

        public Integer getEditionCount() {
            return editionCount;
        }

        public List<Author> getAuthors() {
            return authors;
        }

        public Boolean getHasFulltext() {
            return hasFulltext;
        }

        public String getIa() {
            return ia;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setEditionCount(Integer editionCount) {
            this.editionCount = editionCount;
        }

        public void setAuthors(List<Author> authors) {
            this.authors = authors;
        }

        public void setHasFulltext(Boolean hasFulltext) {
            this.hasFulltext = hasFulltext;
        }

        public void setIa(String ia) {
            this.ia = ia;
        }
    }

    public static class Author {
        private String name;
        private String key;

        // Getters e Setters

        public String getName() {
            return name;
        }

        public String getKey() {
            return key;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

}

