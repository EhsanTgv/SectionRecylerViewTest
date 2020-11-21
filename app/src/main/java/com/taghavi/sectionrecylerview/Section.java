package com.taghavi.sectionrecylerview;

import java.util.List;

public class Section {
    private String sectionTitle;
    private List<String> allItemsInSection;

    public Section(String sectionTitle, List<String> allItemsInSection) {
        this.sectionTitle = sectionTitle;
        this.allItemsInSection = allItemsInSection;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public List<String> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(List<String> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }
}
