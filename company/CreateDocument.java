package com.company;

public class CreateDocument implements ICreateDocument {
    public IDocument createNew() {
        return new TextDocument();
    }
    public IDocument createOpen() {
        return new TextDocument();
    }

}
