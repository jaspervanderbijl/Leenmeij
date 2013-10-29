package utilities;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 *
 * @author Reshad Farid
 * @version 1.0
 *
 * This class is the BASE
 */
public abstract class Task<TInput extends Form, TOutput extends Form>
{

    protected TInput input;

    public TOutput run(TInput input)
    {
        this.input = input;

        if (this.validate())
        {
            return this.execute();
        }

        return null;
    }

    protected abstract TOutput execute();

    protected abstract boolean validate();
}
