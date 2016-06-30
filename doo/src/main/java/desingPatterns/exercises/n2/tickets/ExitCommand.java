package desingPatterns.exercises.n2.tickets;


class ExitCommand extends Command {

	private boolean closed;
	
	protected ExitCommand() {
		super("Salir");
		this.reset();
	}

	@Override
	public Line execute() {
		closed = true;
		return null;
	}

	public boolean closed() {
		return closed;
	}
	
	public void reset() {
		closed = false;
	}
}