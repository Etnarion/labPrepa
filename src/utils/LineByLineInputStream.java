package utils;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class LineByLineInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LineByLineInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    public Byte[] readLine() throws IOException {
        ArrayList<Byte> bytes = new ArrayList<>();
        boolean crFound = false;
        boolean crlfFound = false;
        int by;
        while ((by = read()) != -1 && !crlfFound) {
            if (by == '\r')
                crFound = true;
            if (crFound && by == '\n')
                crlfFound = true;
            else crFound = false;
        }
        return (Byte[])bytes.toArray();
    }
}
