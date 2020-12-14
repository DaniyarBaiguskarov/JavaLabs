package com.company;
public class TextDocument implements IDocument {
    public TextDocument() {
    }
    public IDocument open() {
        return new TextDocument();
    }
    @Override
    public void save() {
    }

}