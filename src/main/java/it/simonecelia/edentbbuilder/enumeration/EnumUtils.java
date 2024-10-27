package it.simonecelia.edentbbuilder.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EnumUtils {

	public static <E extends Enum<E>> E fromStringIgnoreCase ( Class<E> enumClass, String name ) {
		for ( var enumConstant : enumClass.getEnumConstants () ) {
			try {
				// Usa la riflessione per chiamare il metodo getName() su ogni enum
				var enumName = (String) enumClass.getMethod ( "getName" ).invoke ( enumConstant );
				if ( enumName.equalsIgnoreCase ( name ) ) {
					return enumConstant;
				}
			} catch ( Exception e ) {
				throw new IllegalArgumentException ( "Enum class must have a getName() method", e );
			}
		}
		throw new IllegalArgumentException ( "No enum constant for value: " + name );
	}

	public static <E extends Enum<E>> List<String> getEnumNames ( Class<E> enumClass ) {
		List<String> names = new ArrayList<> ();

		for ( var enumConstant : enumClass.getEnumConstants () ) {
			try {
				// Usa la riflessione per chiamare il metodo getName() su ogni enum
				var getNameMethod = enumClass.getMethod ( "getName" );
				var enumName = (String) getNameMethod.invoke ( enumConstant );
				names.add ( enumName );
			} catch ( Exception e ) {
				throw new IllegalArgumentException ( "Enum class must have a getName() method", e );
			}
		}

		Collections.sort ( names );

		return names;
	}
}
