import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class TextFilterBolt extends BaseRichBolt  {
    OutputCollector _collector;
    private String FILTER_KEY="primavera";
    @Override
    public void prepare(Map conf, TopologyContext context, OutputCollector collector) {
        _collector = collector;
    }
    @Override
    public void execute(Tuple tuple) {
	// Get Kafka msg from tuple - mind the types, sometimes Kafka returns bytes
	// Emit if FILTER_KEY contains
       	// ACK tuple 
    }
    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("kafka_text"));
    }
}
