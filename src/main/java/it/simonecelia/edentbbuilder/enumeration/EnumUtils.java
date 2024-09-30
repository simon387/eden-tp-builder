package it.simonecelia.edentbbuilder.enumeration;

public class EnumUtils {

	public static <E extends Enum<E>> E fromStringIgnoreCase ( Class<E> enumClass, String name ) {
		for ( E enumConstant : enumClass.getEnumConstants () ) {
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
}
