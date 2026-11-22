package model.note;

import java.util.Optional;

public final class NoteId {
    private final Long id;

    public NoteId(Long id){
        this.id = Optional.of(id)
            .orElseThrow(() -> new IllegalArgumentException(
                "NoteId cannot be null!"
            ));
    }

    public Long value(){
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NoteId noteId = (NoteId) o;
        return noteId.id.equals(this.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
