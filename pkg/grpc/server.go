package grpc

import (
	"net"

	"google.golang.org/grpc"
)

type Server struct {
	net.Listener
	*grpc.Server
}

func NewServer(addr string, opts ...grpc.ServerOption) (*Server, error) {
	listener, err := net.Listen("tcp", addr)
	if err != nil {
		return nil, err
	}
	return &Server{
		Listener: listener,
		Server:   grpc.NewServer(opts...),
	}, nil
}

// Graceful shutdown
func (s *Server) Shutdown() {
	s.Server.GracefulStop()
}

// Close the server
func (s *Server) Close() error {
	s.Server.Stop()
	return s.Listener.Close()
}
