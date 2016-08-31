object EngineConfig {

  val engineId = sys.env.getOrElse("ENGINE_ID", "default1")
  val engineVersion = sys.env.getOrElse("ENGINE_VERSION", "default")
  val engineVariant = "engine.json"
  val engineVariantId = "default"

}
