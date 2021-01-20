package data.xml;

import java.io.InputStream;

import core.access.GenericFactory;
import core.access.IDataAccess;

public class XmlFactory extends GenericFactory {

    @Override
    public IDataAccess newInstance(InputStream is) {
        XmlDataAccess da =  new XmlDataAccess(is);
        if (this.schema != null) { 
            da.setSchema(schema);
        }
        return da;
    }

}
