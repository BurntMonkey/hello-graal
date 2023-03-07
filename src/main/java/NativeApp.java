
import java.io.IOException;
import org.graalvm.polyglot.*;

public class NativeApp {

	public static void main(String[] args) throws IOException {
		Context polyglot = Context.newBuilder().allowAllAccess(true).build();
		Source.Builder builder = Source.newBuilder(
			"llvm",
			NativeApp.class.getResource("lib/NativeApp.so")
		);
		Source source = builder.build();
		Value cpart = polyglot.eval(source);
		cpart.invokeMember("hello");
	}
}
