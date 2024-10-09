CREATE TABLE IF NOT EXISTS node_state (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    node_id VARCHAR(255) NOT NULL UNIQUE,
    state VARCHAR(255) NOT NULL,
    current_term INTEGER NOT NULL,
    voted_for VARCHAR(255),
    is_stopped BOOLEAN NOT NULL
);