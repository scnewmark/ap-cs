package Labs.VigenèreCipher;

public final class Vigenère {
    private String text;
    private String key;

    public Vigenère() {}

    public Vigenère(final String text, final String key) {
        this.text = text;
        this.key = key;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getText() {
        return this.text;
    }

    public String getKey() {
        return this.key;
    }

    public String encrypt() {
        final char[] key = this.key.toCharArray();
        final StringBuilder builder = new StringBuilder();
        int indexOfKey = 0;
        for (final char x: this.text.toCharArray()) {
            if (indexOfKey == key.length) indexOfKey = 0;
            final int cp = x - 65;
            final int keyChar = key[indexOfKey] - 65;
            final int resultChar = cp + keyChar > 25 ? (cp + keyChar) % 26 : cp + keyChar;
            builder.append((char) (resultChar + 65));
            ++indexOfKey;
        }
        return builder.toString();
    }

    public boolean equals(final Vigenère v) {
        if (this.text == v.getText() && this.key == v.getKey()) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("plaintext = %s\nkey = %s\nencrypted text = %s", 
            this.text, this.key, this.encrypt());
    }
}
